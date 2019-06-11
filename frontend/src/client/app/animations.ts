import { trigger, transition, state, animate, style } from '@angular/animations';

export let slideInOutRight = trigger('slideInOutRight', [
    state('in', style({
        transform: 'translateX(480px)'
    })),
    state('out', style({
        transform: 'translateX(0px)'
    })),
    transition('in => out', animate('350ms ease-in-out')),
    transition('out => in', animate('400ms ease-in-out'))
]);


export let slideInOutRightA = trigger('slideInOutRightA', [
    state('in', style({
        transform: 'translateX(470px)'
    })),
    state('out', style({
        transform: 'translateX(0px)'
    })),
    transition('in => out', animate('350ms ease-in-out')),
    transition('out => in', animate('400ms ease-in-out'))
]);
